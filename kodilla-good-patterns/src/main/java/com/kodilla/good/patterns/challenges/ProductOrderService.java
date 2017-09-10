package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private OrderService orderService;
    private InformationService informationService;
    private OrderRepository orderRepository;

    public ProductOrderService(OrderService orderService, InformationService informationService, OrderRepository orderRepository) {
        this.orderService = orderService;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public boolean process(OrderRequest orderRequest) {

        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct());
        if (isOrdered) {
            informationService.sendInfo(orderRequest.getUser());
            orderRepository.saveOrder(orderRequest);
            return true;
        } else {
            return false;
        }
    }
}

