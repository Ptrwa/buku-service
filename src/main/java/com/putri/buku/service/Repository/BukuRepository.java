/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.putri.buku.service.Repository;

import com.putri.buku.service.Entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp
 */
@Repository

public interface BukuRepository extends JpaRepository<Buku, Long>{

    public Buku findByBukuId(Long bukuId);
    
}
