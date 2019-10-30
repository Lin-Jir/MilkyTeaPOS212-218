package com.milkyteapos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.milkyteapos.dataobject.Good;
import java.util.List;

public interface GoodRepository extends JpaRepository<Good, Integer> {
    Good save(Good good);
    List<Good> findAll();
    Good findById(int goodId);
    Good findByGoodName(String goodName);
    Good findByGoodNameAndSize(String gooodName, int size);
    Good deleteById(int goodId);
    Good deleteByGoodName(String goodName);
}