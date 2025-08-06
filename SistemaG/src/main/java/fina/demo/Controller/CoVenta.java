package fina.demo.Controller;

import fina.demo.Entity.Cliente;
import fina.demo.Entity.Familia;
import fina.demo.Entity.Linea;
import fina.demo.Entity.Producto;
import fina.demo.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/venta")
public class CoVenta {

    @Autowired
    @Qualifier("ventaService")
    private VentaService veServi;

    @Autowired
    @Qualifier("clienteService")
    private ClienteService cliServi;

    @Autowired
    @Qualifier("produservi")
    private ProductoService produServi;

    @Autowired
    @Qualifier("detaVentService")
    private DetalleVentaService detaVeService;

    @Autowired
    @Qualifier("linservi")
    private LineaService linServi;

    @Autowired
    @Qualifier("famservi")
    private FamiliaService famServi;


    @GetMapping({"", "/", "/vista"})
    public ModelAndView v1(){
        ModelAndView mav = new ModelAndView("venta/vent");

        List<Producto> lista = new ArrayList<>();
        List<Cliente> l = cliServi.listCliente();
        List<String> lista2 = new ArrayList<>();
        for (int i = 0; i < l.size() ; i++) {
            lista2.add(l.get(i).getNroDocu());
        }

        mav.addObject("productos",lista);
        mav.addObject("cliente",lista2);




        return mav;
    }


    @GetMapping("/p")
    public ModelAndView vp(){
        ModelAndView mav = new ModelAndView("venta/n");

        List<Producto> lista = new ArrayList<>();
        List<Cliente> l = cliServi.listCliente();
        List<String> lista2 = new ArrayList<>();
        for (int i = 0; i < l.size() ; i++) {
            System.out.println(l.get(i).getNroDocu());
            lista2.add(l.get(i).getNroDocu());
        }

        mav.addObject("productos",lista);
        mav.addObject("cliente",lista2);
        return mav;
    }


    @GetMapping("/p2")
    public ModelAndView vp2(){
        ModelAndView mav = new ModelAndView("venta/n2");

        List<Producto> lista = produServi.listaP();
        List<Linea> l = linServi.listarLi(1);
        List<String> lista2 = new ArrayList<>();

        mav.addObject("producto",lista);
        mav.addObject("linea",l);
        return mav;
    }

}
