package com.example.pocadex.service;

import java.util.List;

import com.example.pocadex.model.Card;


public interface CardService {

	List<Card> getAllCards();
	void saveNewCard(Card newCard);
	Card getCardById(long cardId);
	void deleteCardById(long cardId);
}
