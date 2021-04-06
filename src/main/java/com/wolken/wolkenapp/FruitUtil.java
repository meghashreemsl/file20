package com.wolken.wolkenapp;

import com.wolken.wolkenapp.dao.FruitDAO;
import com.wolken.wolkenapp.dao.FruitDAOImpl;
import com.wolken.wolkenapp.dto.FruitDTO;
import com.wolken.wolkenapp.service.FruitService;
import com.wolken.wolkenapp.service.FruitServiceImpl;

public class FruitUtil {
	
	public static void main(String[] args) {
		 FruitService fruitService = new FruitServiceImpl();
		FruitDTO dto= new FruitDTO();
		dto.setFruitId(18);
		dto.setFruitName("pomogranate");
		
		FruitDAO dao = new FruitDAOImpl();
		fruitService.validateAndSave();
		//dao.createFruit(dto);
		

		//dao.delete(dto);
		fruitService.validateAndDelete(12);
		
		//dao.update(3, "Mango");
		
		//fruitService.validateAndupdate(fruitId, fruitName);
		//fruitService.validateAndDelete(fruitId);

	}
	
	
}
