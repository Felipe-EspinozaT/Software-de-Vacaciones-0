package fina.demo.Controller;

import fina.demo.Entity.Cliente;
import fina.demo.Entity.Familia;
import fina.demo.Entity.Linea;
import fina.demo.Entity.Producto;
import fina.demo.Service.FamiliaService;
import fina.demo.Service.LineaService;
import fina.demo.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pro2")
public class CoPrueba {

    @Autowired
    @Qualifier("linservi")
    private LineaService linServi;

    @Autowired
    @Qualifier("famservi")
    private FamiliaService famServi;

    @Autowired
    @Qualifier("produservi")
    private ProductoService proservi;

    @GetMapping({"", "/", "/vista"})
    public ModelAndView vp2(){
        ModelAndView mav = new ModelAndView("venta/modificarLinea");

        List<Linea> l = linServi.listLine();
        List<Familia> listFami = famServi.findAllFamil();
        mav.addObject("linea",l);
        mav.addObject("familia", listFami);
        return mav;
    }

    @GetMapping("/p3/{id}")
    public ModelAndView vp3(@PathVariable int id){
        ModelAndView mav = new ModelAndView("venta/prueba");

        Linea lin = linServi.getLinea(id);
        System.out.println(lin.getNom());

        List<Familia> listFami = famServi.findAllFamil();
        mav.addObject("linea",lin);
        mav.addObject("familia", listFami);
        return mav;
    }

    @PostMapping("/p3/{id}")
    public String v1 (@ModelAttribute Linea lin, @PathVariable int id){
        linServi.agregarLi(new Linea(id,lin.getNom(),lin.getFamilia()));
        return "redirect:/pro2";
    }

    @GetMapping("/listp")
    public ModelAndView listProduc(){

        ModelAndView mav = new ModelAndView("venta/listarProdu");
        List<Producto> listProdu = proservi.listaP();
        List<Linea> listLin = linServi.listLine();
        mav.addObject("producto",listProdu);
        mav.addObject("linea",listLin);
        return mav;
    }

}
