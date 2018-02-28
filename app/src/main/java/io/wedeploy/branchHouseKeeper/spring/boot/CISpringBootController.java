package io.wedeploy.branchHouseKeeper.spring.boot;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class CISpringBootController {

	@RequestMapping("/")
	public String index(Map<String, Object> model) throws Exception {

		model.put("sample", "sample");

		return "index";
	}

}