package fina.demo.Controller;

import fina.demo.Entity.*;
import fina.demo.Service.FamiliaService;
import fina.demo.Service.LineaService;
import fina.demo.Service.ProductoService;
import fina.demo.Service.UnidadMedidaService;
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

    @Autowired
    @Qualifier("unidaMedidaService")
    private UnidadMedidaService uniMedi;

    @GetMapping({"", "/", "/vista"})
    public ModelAndView vp2(
            @RequestParam(required = false) String buscarNom,
            @RequestParam( required = false) Integer familiaSelect) {

        ModelAndView mav = new ModelAndView("venta/modificarLinea");

        List<Linea>  l = linServi.listarxNom(buscarNom,familiaSelect);


        List<Familia> listFami = famServi.findAllFamil();
        mav.addObject("linea", l);
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

    @GetMapping("/modi/{id}")
    public ModelAndView modificarProdu(@PathVariable int id){
        ModelAndView mav = new ModelAndView("venta/modificarProdu");

        Producto produ = proservi.getProducto(id);
        List<Linea> lin = linServi.listLine();
        List<UnidadMedidas> uniMedidas = uniMedi.listUniMedi();
        mav.addObject("producto",produ);
        mav.addObject("linea",lin);
        mav.addObject("unidadmedida",uniMedidas);

        return mav;
    }

    @PostMapping("/modi/{id}")
    public String v2Produ(@ModelAttribute Producto produ, @PathVariable int id){

        proservi.agregarProducto(new Producto(id,produ.getCod(),produ.getDescrip(),produ.getPrecioSuge(),produ.getStock(),produ.getModeloProdu(),produ.getUnidadMedida(),produ.getLinea()));
        return "redirect:/pro2/listp";
    }

}
