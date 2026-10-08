#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import ${package}.repository.AlumnoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlumnoController 
{
	
	private final AlumnoRepository alumnoRepository;
	
	public AlumnoController(AlumnoRepository alumnoRepository) 
	{
		this.alumnoRepository = alumnoRepository;
	}
	
	@GetMapping("/")
	public String mostrarPrototipo(Model model) 
	{
		model.addAttribute("totalAlumno", alumnoRepository.count());
		return "prototipo";
	}
}
