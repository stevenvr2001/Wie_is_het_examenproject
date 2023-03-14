package be.kdg.projectbasis.model.character.Enums;

public enum HaarStijl {

        krullen, golvend ,stijl, kaal;

        public boolean matches(String question) {
            return question.contains(name().toLowerCase());
        }


    }

