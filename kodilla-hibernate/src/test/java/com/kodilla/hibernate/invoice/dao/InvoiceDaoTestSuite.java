package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //given
        Product product1 = new Product("Gruszka");
        Product product2 = new Product("Jabłko");
        Product product3 = new Product("Kalafior");
        Product product4 = new Product("Czekolada");
        Item item1 = new Item(new BigDecimal(5), 2, new BigDecimal(10));
        Item item2 = new Item(new BigDecimal(4), 10, new BigDecimal(40));
        Item item3 = new Item(new BigDecimal(6), 1, new BigDecimal(6));
        Item item4 = new Item(new BigDecimal(4), 5, new BigDecimal(20));
        Item item5 = new Item(new BigDecimal(5), 8, new BigDecimal(40));
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product4);
        item5.setProduct(product1);
        Invoice invoice = new Invoice("FV_2024");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        item5.setInvoice(invoice);

        //when
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //then
        Assertions.assertNotEquals(0, id);
        //clean up
        //invoiceDao.deleteById(id);


    }
}
