package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.FruitDTO;

public interface FruitDAO {
	public void createFruit(FruitDTO dto);
    //public void update(int fruitId, String fruitName);
    //public void delete(FruitDTO dto);
    public void delete(int fruitId);


}
