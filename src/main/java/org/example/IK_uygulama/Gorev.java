package org.example.IK_uygulama;

public class Gorev {
        private String aciklama;
        private boolean tamamlandi;

        public Gorev(String aciklama) {
            this.aciklama = aciklama;
            this.tamamlandi = false;
        }

        public String getAciklama() {
            return aciklama;
        }

        public void setAciklama(String aciklama) {
            this.aciklama = aciklama;
        }

        public boolean isTamamlandi() {
            return tamamlandi;
        }

        public void setTamamlandi(boolean tamamlandi) {
            this.tamamlandi = tamamlandi;
        }
    }
