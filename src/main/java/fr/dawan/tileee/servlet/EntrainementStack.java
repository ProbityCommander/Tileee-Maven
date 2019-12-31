package fr.dawan.tileee.servlet;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.tileee.bean.Card;
import fr.dawan.tileee.bean.Tag;
import fr.dawan.tileee.bean.User;
import fr.dawan.tileee.dao.CardDao;
import fr.dawan.tileee.service.TagsService;

@Controller
@RequestMapping("tileee")
public class EntrainementStack {

	@Autowired
	private TagsService service;
	
	private String displayPag(Integer page, Integer max,  Model model) {
		int start = (page - 1) * max;
		List<Tag> ls = service.pagination(start, max);
		model.addAttribute("lst", ls);
		
		boolean suivExist = (page*max) < service.count();
		System.out.println(service.count());
		model.addAttribute("suivExist", suivExist);
		model.addAttribute("page", page);
		model.addAttribute("max", max);
		
		return "entrainement";	
	}
	
	@GetMapping("/EntrainementStack/{tag}")
	public String pagination(@PathVariable("tag") String tag, Model model) {
		CardDao carddao = new CardDao();
		HttpSession session = model.getSession();
		User user = (User) session.getAttribute("user");
		
		List<Card> listCard = carddao.findByTag(user, tag, true);
		session.setAttribute()
		return displayPag(page, TagPerPage, model);
	}
}
