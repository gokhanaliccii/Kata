package com.gokhanaliccii.kata.reactive;

public class Activity {

    private SavedState internalState;

    public void setDummyState(SavedState internalState) {
        this.internalState = internalState;
    }

    boolean isStateSaved() {
        return internalState.isStateSaved();
    }

    public static class SavedState {

        private String name;
        private String surname;

        public void setName(String name) {
            this.name = name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public boolean isStateSaved() {
            return name != null && surname != null;
        }
    }

}
