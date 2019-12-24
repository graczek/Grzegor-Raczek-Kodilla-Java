package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //given
        Product bread = new Product("bread");

        Item item1 = new Item( new BigDecimal(15), 3, new BigDecimal(45));
        Item item2 = new Item( new BigDecimal(2), 4, new BigDecimal(8));

        Invoice invoice = new Invoice("2");

        bread.getItems().add(item1);
        bread.getItems().add(item2);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item1.setProduct(bread);
        item2.setProduct(bread);

        item2.setInvoice(invoice);
        item1.setInvoice(invoice);

        //when
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //then
        Assert.assertNotEquals(0, id);

        //CleanUp
        try {
            invoiceDao.deleteById(id);
        } catch (Exception e) {
        //do nothing
        }

    }
}
