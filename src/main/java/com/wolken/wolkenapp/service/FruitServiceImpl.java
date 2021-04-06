package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dao.FruitDAO;
import com.wolken.wolkenapp.dao.FruitDAOImpl;
import com.wolken.wolkenapp.dto.FruitDTO;

public class FruitServiceImpl implements FruitService {

	FruitDTO dto = new FruitDTO();
	FruitDAO dao = new FruitDAOImpl();
	
	@Override
	public void validateAndSave() {
		// TODO Auto-generated method stub
		
 		if(dto.getFruitId()>0) {
			if(dto.getFruitName()!=null) {
				dao.createFruit(dto);
			}else {
				System.out.println("Fruit name is not valid");
			}
			
		}else {
			System.out.println("Fruit id is not valid");
		}
		
	}

	/*
	 * @Override public void validateAndUpdate(int fruitId,String fruitName) { //
	 * TODO Auto-generated method stub if(dto.getFruitId()>0) {
	 * if(dto.getFruitName()!=null) { dao.update(fruitId, fruitName); }else {
	 * System.out.println("Fruit name is not valid"); }
	 * 
	 * }else { System.out.println("Fruit id is not valid"); }
	 * 
	 * }
	 */
		
	@Override
	public void validateAndDelete(int fruitId) {
		// TODO Auto-generated method stub
		if(fruitId >0) {
				dao.delete(fruitId);
			
		}else {
			System.out.println("Fruit id is not valid");
		}
		
	}

}
