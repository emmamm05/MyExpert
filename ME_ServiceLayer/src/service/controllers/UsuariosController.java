package service.controllers;

import java.sql.Timestamp;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import logic.CatalogosLogic;
import logic.LogicFactory;
import models.TituloModel;
import models.UsuarioModel;

@Path("/Usuarios")
public class UsuariosController {

	@Path("/expertos")
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<UsuarioModel> getAllExpertos(){
		LogicFactory factory = new LogicFactory();
		List<UsuarioModel> expertos =factory.createCuentaLogic().getAllExpertos();
		return expertos;
	}
	
	
}
