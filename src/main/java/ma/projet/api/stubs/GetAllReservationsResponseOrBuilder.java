// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package ma.projet.api.stubs;

public interface GetAllReservationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetAllReservationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  java.util.List<ma.projet.api.stubs.Reservation> 
      getReservationsList();
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  ma.projet.api.stubs.Reservation getReservations(int index);
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  int getReservationsCount();
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  java.util.List<? extends ma.projet.api.stubs.ReservationOrBuilder> 
      getReservationsOrBuilderList();
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  ma.projet.api.stubs.ReservationOrBuilder getReservationsOrBuilder(
      int index);
}
