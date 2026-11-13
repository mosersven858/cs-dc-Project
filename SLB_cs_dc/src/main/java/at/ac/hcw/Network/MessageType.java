package at.ac.hcw.Network;

/**
 * MessageType
 */
public enum MessageType { //so kann mann ferstellen ob es eine request von entweder oder client / server oder vise versa ist
                          //man sagt dann einfach, wenn wir das so verarbeitet haben im Server MessageType = MessageType.Response
                          //und der client hört das ab weil er auf ne response wartet
    Response,
    Request
}