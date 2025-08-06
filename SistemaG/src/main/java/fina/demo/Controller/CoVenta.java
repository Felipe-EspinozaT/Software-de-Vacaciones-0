package fina.demo.Controller;

import fina.demo.Entity.Producto;
import fina.demo.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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


    @GetMapping("/vista")
    public ModelAndView v1(){
        ModelAndView mav = new ModelAndView("vent");

        //List< Producto > lista = produServi.listPCod(1,2,"23");

       // mav.addObject("listaP",lista );



        return mav;
    }


}
