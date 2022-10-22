package com.example.pocadex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pocadex.model.Card;
import com.example.pocadex.repository.CardRepository;

@Service
public class CardServiceImpl implements CardService {

	@Autowired
	private CardRepository cardRepository;
	
	@Override
	public List<Card> getAllCards() {
		
		return cardRepository.findAll();
	}

	@Override
	public void saveNewCard(Card newCard) {
		
		this.cardRepository.save(newCard);
	}

	@Override
	public Card getCardById(long cardId) {
		
		Optional<Card> cardOptional = cardRepository.findById(cardId);
		Card cardById = null;
		if(cardOptional.isPresent()) {
			cardById = cardOptional.get();
		} else {
			throw new RuntimeException("Card Not Found for ID ::" + cardId);
		}
		return cardById;
	}

	@Override
	public void deleteCardById(long cardId) {
		
		this.cardRepository.deleteById(cardId);
	}

}
