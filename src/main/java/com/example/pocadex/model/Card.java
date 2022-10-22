package com.example.pocadex.model;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@EnableAutoConfiguration
@Entity
@Table(name = "cards")
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cardId;
	
	@Column(name = "card_name")
	private String cardName;
	
	@Column(name = "card_set")
	private String cardSet;
	
	@Column(name = "card_tier")
	private String cardTier;
	
	@Column(name = "card_set_list_number")
	private String cardSetListNumber;
	
	@Column(name = "card_quantity")
	private long cardQuantity;

	public long getCardId() {
		return cardId;
	}
	public void setCardId(long cardId) {
		this.cardId = cardId;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardSet() {
		return cardSet;
	}
	public void setCardSet(String cardSet) {
		this.cardSet = cardSet;
	}
	public String getCardTier() {
		return cardTier;
	}
	public void setCardTier(String cardTier) {
		this.cardTier = cardTier;
	}
	public String getCardSetListNumber() {
		return cardSetListNumber;
	}
	public void setCardSetListNumber(String cardSetListNumber) {
		this.cardSetListNumber = cardSetListNumber;
	}
	public long getCardQuantity() {
		return cardQuantity;
	}
	public void setCardQuantity(long cardQuantity) {
		this.cardQuantity = cardQuantity;
	}
	
}
