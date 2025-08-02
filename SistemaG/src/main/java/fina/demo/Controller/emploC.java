package fina.demo.Controller;


import fina.demo.Service.FamiliaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/sis")
public class emploC {

	@Autowired
	@Qualifier("famservi")
	private FamiliaService famservi;


	@GetMapping({"", "/", "/uno"})
	public ModelAndView uno() {
		ModelAndView mav = new ModelAndView("listFam");

		mav.addObject("fami",famservi.findAllFamil() );

		return mav;
	}





















/*
	@Autowired
	private IZonaTuristicaService zonaService;
	@Autowired
	private EstacionService estacionService;
	@Autowired
	private ActividadService actividadService;
	@Autowired
	private TipoLugarService tipoLugarService;
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping({"", "/", "/lista"})
	public String listarZonas(Model model) {
		try {
			model.addAttribute("zonas", zonaService.listarZonas());
		} catch (Exception e) {
			model.addAttribute("error", "Error al cargar las zonas: " + e.getMessage());
		}
		return "ZonaTuristica/ListaZona";
	}

	@GetMapping("/crear")
	public String mostrarFormularioCrear(Model model) {
		try {
			model.addAttribute("zona", new ZonaTuristica());
			model.addAttribute("estaciones", estacionService.listar());
			model.addAttribute("actividades", actividadService.listar());
			model.addAttribute("tiposLugar", tipoLugarService.findAllTipoLugar());
		} catch (Exception e) {
			model.addAttribute("error", "Error al cargar el formulario: " + e.getMessage());
		}
		return "ZonaTuristica/CrearZona";
	}

	@PostMapping("/pcrear")
	public String guardarZona(@RequestParam(name = "file", required = false) MultipartFile foto, @ModelAttribute ZonaTuristica zona, RedirectAttributes redirectAttributes) {
		try {
			  zona.setActivo(true);

			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			String username = authentication.getName();

			Usuario usuario = usuarioService.buscarPorUsername(username);
			if (usuario == null) throw new RuntimeException("Usuario no encontrado");

			zona.setCreadoPor(usuario);

			ZonaTuristica zo =  zonaService.guardarZona(zona,foto);
			nombreFoto(foto,zo.getId());
			redirectAttributes.addFlashAttribute("mensaje", "Zona turística creada exitosamente");
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("error", "Error al guardar la zona: " + e.getMessage());
		}
		return "redirect:/zona/lista";
	}
	public String nombreFoto(MultipartFile foto, int id) {

		if (!foto.isEmpty()) {
			try {
				String originalFilename = foto.getOriginalFilename();
				String extension = "";
				int i = originalFilename.lastIndexOf('.');
				if (i > 0) {
					extension = originalFilename.substring(i);
				}
				if (extension.equals(".jpg")|| extension.equals(".jpeg") || extension.equals(".png") || extension.equals(".webp") || extension.equals(".svg")) {
					Path filePath = Paths.get("src/main/resources/static/img/zonas/z" + id+ ".jpg");
					Files.copy(foto.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
					return "z"+id + ".jpg";
				} else {
					System.out.println("formato no valida");
					return "ddd.png";
				}
			} catch (Exception e) {
				System.out.println("error al cargar la foto: " + e.getMessage());
				return "ddd.png";
			}
		} else {
			System.out.println("foto por deafault asignada");
			return "ddd.png";
		}
	}

	@GetMapping("/ver/{id}")
	public String verZona(@PathVariable int id, Model model, RedirectAttributes redirectAttributes) {
		try {
			ZonaTuristica zona = zonaService.obtenerZonaPorId(id);
			if (zona == null) {
				redirectAttributes.addFlashAttribute("error", "Zona no encontrada");
				return "redirect:/zona/lista";
			}
			model.addAttribute("zona", zona);
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("error", "Error al cargar la zona: " + e.getMessage());
			return "redirect:/zona/lista";
		}
		return "ZonaTuristica/VerZona";
	}

	@GetMapping("/editar/{id}")
	public String editarZona(@PathVariable int id, Model model, RedirectAttributes redirectAttributes) {
		try {
			ZonaTuristica zona = zonaService.obtenerZonaPorId(id);
			if (zona == null) {
				redirectAttributes.addFlashAttribute("error", "Zona no encontrada");
				return "redirect:/zona/lista";
			}
			model.addAttribute("zona", zona);
			model.addAttribute("estaciones", estacionService.listar());
			model.addAttribute("actividades", actividadService.listar());
			model.addAttribute("tiposLugar", tipoLugarService.findAllTipoLugar());
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("error", "Error al cargar el formulario: " + e.getMessage());
			return "redirect:/zona/lista";
		}
		return "ZonaTuristica/EditarZona";
	}

	@PostMapping("/editar/{id}")
	public String actualizarZona(@RequestParam(name = "file", required = false) MultipartFile foto,@ModelAttribute ZonaTuristica zona, @PathVariable int id, RedirectAttributes redirectAttributes) {
		try {
			ZonaTuristica existente = zonaService.obtenerZonaPorId(id);
			if (existente == null) {
				redirectAttributes.addFlashAttribute("error", "Zona no encontrada");
				return "redirect:/zona/lista";
			}

			zona.setId(id);
			zona.setCreadoPor(existente.getCreadoPor()); // se mantiene el creador original
			zonaService.actualizarZona(zona,foto);

			redirectAttributes.addFlashAttribute("mensaje", "Zona turística actualizada exitosamente");
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("error", "Error al actualizar la zona: " + e.getMessage());
		}
		return "redirect:/zona/lista";
	}

	@PostMapping("/desactivar/{id}")
	public String desactivarZona(@PathVariable int id, RedirectAttributes redirectAttributes) {
		try {
			zonaService.desactivarZona(id);
			redirectAttributes.addFlashAttribute("mensaje", "Zona turística desactivada exitosamente");
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("error", "Error al desactivar la zona: " + e.getMessage());
		}
		return "redirect:/zona/lista";
	}*/
}
