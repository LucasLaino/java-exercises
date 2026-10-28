/**
 * Represents the status of an order and the transitions allowed between statuses.
 *
 * An order moves forward through its life cycle and can be canceled before
 *  * it is shipped. Valid transitions: {@code CREATED -> PAID},
 *  * {@code CREATED -> CANCELLED}, {@code PAID -> SHIPPED},
 *  * {@code PAID -> CANCELLED} and {@code SHIPPED -> DELIVERED}.
 *  * {@code DELIVERED} and {@code CANCELLED} are final: no transition is
 *  * allowed from them.
 */
public enum OrderStatus {
    /** The order was created and is waiting for payment. */
    CREATED {
        @Override
        public boolean canTransitionTo(OrderStatus newStatus) {
            return newStatus == PAID || newStatus == CANCELLED;
        }
    },
    /** The order was paid and is waiting to be shipped. */
    PAID {
        @Override
        public boolean canTransitionTo(OrderStatus newStatus) {
            return newStatus == SHIPPED || newStatus == CANCELLED;
        }
    },
    /** The order was shipped and is on its way to the customer. */
    SHIPPED {
        @Override
        public boolean canTransitionTo(OrderStatus newStatus) {
            return newStatus == DELIVERED;
        }
    },
    /** The order was delivered to the customer. Final status. */
    DELIVERED {
        @Override
        public boolean canTransitionTo(OrderStatus newStatus) {
            return false;
        }
    },
    /** The order was cancelled. Final status. */
    CANCELLED {
        @Override
        public boolean canTransitionTo(OrderStatus newStatus) {
            return false;
        }
    };

    /**
     *
     * @param newStatus the status the order would move to
     * @return {@code true} if the transition is allowed, {@code false}
     *         otherwise, including when {@code newStatus} is {@code null}
     */
    public abstract boolean canTransitionTo(OrderStatus newStatus);

    public static void main(String[] args) {
        System.out.println(OrderStatus.CREATED.canTransitionTo(OrderStatus.PAID));
        System.out.println(OrderStatus.DELIVERED.canTransitionTo(OrderStatus.PAID));
        System.out.println(OrderStatus.PAID.canTransitionTo(OrderStatus.CANCELLED));
    }
}
