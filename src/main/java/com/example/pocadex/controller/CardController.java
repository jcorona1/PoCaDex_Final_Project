package com.example.pocadex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.pocadex.model.Card;
import com.example.pocadex.service.CardService;

@Controller
public class CardController {

	@Autowired
	private CardService cardService;
	
	@GetMapping("/")
	public String homePage() {
		
		return "index";
	}
	
	@GetMapping("/viewCollection")
	public String viewCollection(Model collectionModel) {
		
		collectionModel.addAttribute("listCards", cardService.getAllCards());
		return "view_collection";
	}
	
	@GetMapping("/addNewCards") 
	public String addNewCards(Model newCardModel) {
		
		Card newCard = new Card();
		newCardModel.addAttribute("card", newCard);
		return "add_new_cards";
	}
	
	@PostMapping("/saveNewCard")
	public String saveNewCard(@ModelAttribute("card") Card newCard) {
		
		cardService.saveNewCard(newCard);
		return "redirect:/addNewCards";
	}
	
	@PostMapping("/saveCardUpdate")
	public String saveCardUpdate(@ModelAttribute("card") Card updatedCard) {
		
		cardService.saveNewCard(updatedCard);
		return "redirect:/updateCollection";
	}
	
	@GetMapping("/updateCollection")
	public String updateCollection(Model collectionModel) {
		
		collectionModel.addAttribute("listCards", cardService.getAllCards());
		return "update_collection";
	}
	
	@GetMapping("/updateCard/{cardId}")
	public String updateCard(@PathVariable(value = "cardId") long cardId, Model cardByIdModel) {
		
		Card cardById = cardService.getCardById(cardId);
		
		cardByIdModel.addAttribute("card", cardById);
		return "update_card";
	}
	
	@GetMapping("/deleteCard/{cardId}")
	public String deleteCard(@PathVariable(value = "cardId") long cardId) {
		
		this.cardService.deleteCardById(cardId);
		return "redirect:/updateCollection";
	}
}
