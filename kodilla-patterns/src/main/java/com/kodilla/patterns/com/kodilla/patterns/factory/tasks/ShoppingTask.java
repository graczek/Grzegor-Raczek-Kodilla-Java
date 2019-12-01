package com.kodilla.patterns.com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {

        boolean isExecuted;
        final String taskName;
        final String whatToBuy;
        final double quantity;

        public ShoppingTask(String taskName, String whatToBuy, double quantity) {
            this.taskName = taskName;
            this.whatToBuy = whatToBuy;
            this.quantity = quantity;
        }

        @Override
        public String getTaskName() {
            return taskName;
        }

        @Override
        public void executeTask() {
                System.out.println("Executing shopping task");
                isExecuted = true;
        }

        @Override
        public boolean isExecuted() {
            return isExecuted;
        }

        @Override
        public String toString() {
            return "ShoppingTask{" +
                    "taskName='" + taskName + '\'' +
                    ", whatToBuy='" + whatToBuy + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }

}
