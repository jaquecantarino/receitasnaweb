package Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /* identifica essa classe como controller */
@RequestMapping("/usuarioleitor" /* indica o caminho (endpoint) que deve ser usado para acessar a pagina */)
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class usuarioLeitorController {
	
	

}
