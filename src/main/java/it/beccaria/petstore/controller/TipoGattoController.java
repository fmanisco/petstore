package it.beccaria.petstore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.beccaria.petstore.dto.TipoGattoDto;
import it.beccaria.petstore.service.TipoGattoRestService;
import it.beccaria.controller.BeccariaGenericRestController;
import it.beccaria.controller.enumeration.EnRestMethod;
import it.beccaria.security.auth.enumeration.EnAutority;
import it.beccaria.security.auth.interf.Permission;

/**
 * Comune REST API
 */
@RestController()
@RequestMapping("/tipi-gatto")
@Permission(method = EnRestMethod.POST, authorities = EnAutority.BLOCKED)
@Permission(method = EnRestMethod.PUT, authorities = EnAutority.BLOCKED)
@Permission(method = EnRestMethod.DELETE, authorities = EnAutority.BLOCKED)
@Permission(method = EnRestMethod.PATCH, authorities = EnAutority.BLOCKED)
public class TipoGattoController extends BeccariaGenericRestController<TipoGattoDto, Long, TipoGattoRestService> {

}
