package lk.ijse.gdse66.HelloShoes.repository;

import lk.ijse.gdse66.HelloShoes.entity.SaleInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface SaleInventoryRepo extends JpaRepository<SaleInventory, String> {

    List<SaleInventory> findBySaleService_OrderID(String orderNo);

    @Query("SELECT s FROM SaleInventory s WHERE DATE(s.purchase_data) = :date")
    List<SaleInventory> findByPurchase_data(@Param("date") Date date);
}
