package org.example.board.domain.board.product.repository;

import jakarta.persistence.LockModeType;
import org.example.board.domain.board.product.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("SELECT p FROM Product p WHERE p.idx = :idx")
    Optional<Product> findByIdWithLock(Long idx);

    Optional<List<Product>> findAllByProductBoardIdx(Long idx);
}
