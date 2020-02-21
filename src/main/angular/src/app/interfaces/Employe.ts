import { Bassin } from './Bassin';

export interface Employe  {

    idEmploye : number;
    nom : string;
    identifiant : string;
    motdepasse : string;
    prenom : string;
    adresse : string;
    dateDeNaissance : string;
    numSecuSociale : string;
    role : string;
    listebassins : Array<Bassin>;

}