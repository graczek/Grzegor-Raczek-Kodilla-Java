package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

        private InformationService informationService;
        private RentalService rentalService;
        private RentalRepository rentalRepository;

        public ProductOrderService(final InformationService informationService, final RentalService rentalService,
                                   final RentalRepository rentalRepository) {
            this.informationService = informationService;
            this.rentalService = rentalService;
            this.rentalRepository = rentalRepository;
        }

        public OrderDto process(final OrderRequest orderRequest) {
            boolean isOrdered = rentalService.order(orderRequest.getUser(), orderRequest.getOderDate());

            if(isOrdered) {
                informationService.inform(orderRequest.getUser());
                rentalRepository.createOrder(orderRequest.getUser(), orderRequest.getOderDate());
                return new OrderDto(orderRequest.getUser(), true);
            } else {
                return new OrderDto(orderRequest.getUser(), false);
            }
        }
}
