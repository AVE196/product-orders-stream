package ru.ave.productOrder;

import ru.ave.productOrder.models.Customer;
import ru.ave.productOrder.models.Order;
import ru.ave.productOrder.models.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    static void main() {

        Product product1 = new Product("молоко", "еда", BigDecimal.valueOf(100));
        Product product2 = new Product("яйца", "еда", BigDecimal.valueOf(90));
        Product product3 = new Product("игрушка", "детские товары", BigDecimal.valueOf(1000));
        Product product4 = new Product("мяч", "детские товары", BigDecimal.valueOf(1500));
        Product product5 = new Product("вода", "напитки", BigDecimal.valueOf(20));
        Product product6 = new Product("детское пюре", "детские товары", BigDecimal.valueOf(50));
        Product product7 = new Product("колбаса", "еда", BigDecimal.valueOf(700));
        Product product8 = new Product("детское мыло", "детские товары", BigDecimal.valueOf(150));
        Product product9 = new Product("водка", "алкоголь", BigDecimal.valueOf(900));

        Set<Product> products1 = Set.of(product1, product5, product9);
        Set<Product> products2 = Set.of(product4, product1, product2);
        Set<Product> products3 = Set.of(product9, product5, product4, product7);
        Set<Product> products4 = Set.of(product2, product3, product8);
        Set<Product> products5 = Set.of(product6, product2, product8, product4);
        Set<Product> products6 = Set.of(product1, product5, product4);
        Set<Product> products7 = Set.of(product8, product2, product9, product5, product4);
        Set<Product> products8 = Set.of(product4, product8, product3);
        Set<Product> products9 = Set.of(product7, product4, product1, product6);
        Set<Product> products10 = Set.of(product7, product4, product1, product6);
        Set<Product> products11 = Set.of(product1, product5, product9);
        Set<Product> products12 = Set.of(product4, product1, product2);
        Set<Product> products13 = Set.of(product9, product5, product4, product7);
        Set<Product> products14 = Set.of(product2, product3, product8);
        Set<Product> products15 = Set.of(product6, product2, product8, product4);
        Set<Product> products16 = Set.of(product1, product5, product4);
        Set<Product> products17 = Set.of(product8, product2, product9, product5, product4);
        Set<Product> products18 = Set.of(product4, product8, product3);
        Set<Product> products19 = Set.of(product7, product4, product1, product6);
        Set<Product> products20 = Set.of(product7, product4, product1, product6);
        Set<Product> products21 = Set.of(product1, product5, product9);
        Set<Product> products22 = Set.of(product4, product1, product2);
        Set<Product> products23 = Set.of(product9, product5, product4, product7);
        Set<Product> products24 = Set.of(product2, product3, product8);
        Set<Product> products25 = Set.of(product6, product2, product8, product4);

        Order order1 = new Order(LocalDate.of(2026, 6, 12), LocalDate.of(2026, 6, 14), "доставлен", products1);
        Order order2 = new Order(LocalDate.of(2026, 6, 7), LocalDate.of(2026, 6, 11), "доставлен", products2);
        Order order3 = new Order(LocalDate.of(2026, 2, 7), LocalDate.of(2026, 2, 11), "в процесс", products3);
        Order order4 = new Order(LocalDate.of(2026, 2, 7), LocalDate.of(2026, 2, 11), "доставлен", products4);
        Order order5 = new Order(LocalDate.of(2026, 2, 7), LocalDate.of(2026, 2, 11), "в процесс", products5);
        Order order6 = new Order(LocalDate.of(2026, 2, 7), LocalDate.of(2026, 2, 11), "доставлен", products6);
        Order order7 = new Order(LocalDate.of(2026, 2, 7), LocalDate.of(2026, 2, 14), "в процесс", products7);
        Order order8 = new Order(LocalDate.of(2026, 2, 7), LocalDate.of(2026, 2, 14), "доставлен", products8);
        Order order9 = new Order(LocalDate.of(2026, 2, 12), LocalDate.of(2026, 2, 14), "доставлен", products9);
        Order order10 = new Order(LocalDate.of(2026, 3, 18), LocalDate.of(2026, 3, 19), "в процесс", products10);
        Order order11 = new Order(LocalDate.of(2026, 3, 18), LocalDate.of(2026, 3, 19), "доставлен", products11);
        Order order12 = new Order(LocalDate.of(2026, 3, 18), LocalDate.of(2026, 3, 19), "в процесс", products12);
        Order order13 = new Order(LocalDate.of(2026, 3, 2), LocalDate.of(2026, 3, 11), "доставлен", products13);
        Order order14 = new Order(LocalDate.of(2026, 3, 2), LocalDate.of(2026, 3, 11), "в процесс", products14);
        Order order15 = new Order(LocalDate.of(2026, 3, 2), LocalDate.of(2026, 6, 11), "доставлен", products15);
        Order order16 = new Order(LocalDate.of(2026, 6, 2), LocalDate.of(2026, 6, 11), "доставлен", products16);
        Order order17 = new Order(LocalDate.of(2026, 6, 2), LocalDate.of(2026, 6, 11), "доставлен", products17);
        Order order18 = new Order(LocalDate.of(2026, 6, 6), LocalDate.of(2026, 6, 8), "в процесс", products18);
        Order order19 = new Order(LocalDate.of(2026, 6, 6), LocalDate.of(2026, 6, 8), "доставлен", products19);
        Order order20 = new Order(LocalDate.of(2026, 4, 6), LocalDate.of(2026, 4, 8), "доставлен", products20);
        Order order21 = new Order(LocalDate.of(2026, 4, 6), LocalDate.of(2026, 4, 8), "в процесс", products21);
        Order order22 = new Order(LocalDate.of(2026, 4, 6), LocalDate.of(2026, 4, 8), "доставлен", products22);
        Order order23 = new Order(LocalDate.of(2026, 5, 12), LocalDate.of(2026, 5, 14), "в процесс", products23);
        Order order24 = new Order(LocalDate.of(2026, 5, 12), LocalDate.of(2026, 5, 14), "доставлен", products24);
        Order order25 = new Order(LocalDate.of(2026, 5, 12), LocalDate.of(2026, 5, 14), "доставлен", products25);

        Set<Order> orders1 = Set.of(order1, order2, order3, order4, order5);
        Set<Order> orders2 = Set.of(order6, order7, order8, order9, order10);
        Set<Order> orders3 = Set.of(order11, order12, order13, order14, order15);
        Set<Order> orders4 = Set.of(order16, order17, order18, order19, order20);
        Set<Order> orders5 = Set.of(order21, order22, order23, order24, order25);

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Жека", orders1));
        customers.add(new Customer("Леха",2L, orders2));
        customers.add(new Customer("Юля", 3L, orders3));
        customers.add(new Customer("Саня", 2L,orders4));
        customers.add(new Customer("Толян", orders5));



    }

}
