// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package ma.projet.api.stubs;

public interface UtilisateurOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Utilisateur)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string nom = 2;</code>
   * @return The nom.
   */
  java.lang.String getNom();
  /**
   * <code>string nom = 2;</code>
   * @return The bytes for nom.
   */
  com.google.protobuf.ByteString
      getNomBytes();

  /**
   * <code>string motDePasse = 3;</code>
   * @return The motDePasse.
   */
  java.lang.String getMotDePasse();
  /**
   * <code>string motDePasse = 3;</code>
   * @return The bytes for motDePasse.
   */
  com.google.protobuf.ByteString
      getMotDePasseBytes();

  /**
   * <code>.Role role = 4;</code>
   * @return The enum numeric value on the wire for role.
   */
  int getRoleValue();
  /**
   * <code>.Role role = 4;</code>
   * @return The role.
   */
  ma.projet.api.stubs.Role getRole();
}
