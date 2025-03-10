package com.order.perf.dto;

import com.order.perf.domain.Delivery;
import lombok.Builder;
import lombok.Getter;

// 배송 정보 DTO
@Getter
public class DeliveryDetailsResponse {

    private String recipientName;
    private String mobile;
    private String address;
    private String zipCode;
    private String storePassword;
    private String deliveryMemo;

    public DeliveryDetailsResponse() {}

    @Builder
    public DeliveryDetailsResponse(final String recipientName, final String mobile,
                                   final String address, final String zipCode,
                                   final String storePassword, final String deliveryMemo) {
        this.recipientName = recipientName;
        this.mobile = mobile;
        this.address = address;
        this.zipCode = zipCode;
        this.storePassword = storePassword;
        this.deliveryMemo = deliveryMemo;
    }

    public static DeliveryDetailsResponse from(final Delivery delivery) {
        return DeliveryDetailsResponse.builder()
                .recipientName(delivery.getRecipientName())
                .mobile(delivery.getMobile())
                .address(delivery.getAddress())
                .zipCode(delivery.getZipCode())
                .storePassword(delivery.getStorePassword())
                .deliveryMemo(delivery.getDeliveryMemo())
                .build();
    }
}
