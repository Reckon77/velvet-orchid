package com.hotel.VelvetOrchid.service.interfac;

import com.hotel.VelvetOrchid.dto.Response;
import com.hotel.VelvetOrchid.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
