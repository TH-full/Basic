package com.incom.report;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class jdbcController {

	private static final Logger logger = LoggerFactory.getLogger(jdbcController.class);
	
	@RequestMapping(value = "/jdbc", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );

		return "test";
	}
	
	
	public static void main(String[] args) {

		/*
		 * AnnotationConfigApplicationContext context = new
		 * AnnotationConfigApplicationContext(jdbcConfig.class);
		 * 
		 * reportMapperImpl mapper = context.getBean("test_mapper",
		 * reportMapperImpl.class);
		 * 
		 * // SELECT List<reportVO> list1 = mapper.select_data(); for(reportVO bean1:
		 * list1) { System.out.println("=================");
		 * System.out.println("@ NO       : " + bean1.getCust_id());
		 * System.out.println("@ NAME     : " + bean1.getCust_name());
		 * System.out.println("@ GENDER   : " + bean1.getCust_gender());
		 * System.out.println("================="); list1.add(bean1); }
		 * 
		 * context.close();
		 */
	}
}
