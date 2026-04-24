package tp5_java;

public class TestAbonnements {

    public static void main(String[] args) {

        Abonnement[] abonnements = new Abonnement[3];

        AbonnementVideo abonnementVideo = new AbonnementVideo("Netflix", 100, 4);
        abonnementVideo.setOptionHD(true);
        abonnementVideo.setOption4K(true);

        AbonnementMusique abonnementMusique = new AbonnementMusique("Spotify", 80, 2);
        abonnementMusique.setNbPlaylists(25);
        abonnementMusique.setOptionOffline(true);

        AbonnementJeux abonnementJeux = new AbonnementJeux("GamePass", 120, 3);
        abonnementJeux.setNbJeuxInclus(60);
        abonnementJeux.setHeuresJeuParMois(50);

        abonnements[0] = abonnementVideo;
        abonnements[1] = abonnementMusique;
        abonnements[2] = abonnementJeux;

        for (Abonnement a : abonnements) {
            a.afficherInfos();
            System.out.println("Cout mensuel : " + a.calculerCoutMensuel());
            System.out.println("Score satisfaction : " + a.calculerScoreSatisfaction());
            System.out.println("=================================================");
        }

        Reducible[] reducibles = new Reducible[2];
        reducibles[0] = abonnementVideo;
        reducibles[1] = abonnementMusique;

        for (Reducible r : reducibles) {
            System.out.println("Reduction 20% : " + r.AppliquerReduction(20));
            System.out.println("Reduction 50% : " + r.AppliquerReduction(50));
            System.out.println("=================================================");
        }
    }
}