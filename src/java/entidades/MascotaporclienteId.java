package entidades;
// Generated 12-jul-2019 10:45:07 by Hibernate Tools 4.3.1



/**
 * MascotaporclienteId generated by hbm2java
 */
public class MascotaporclienteId  implements java.io.Serializable {


     private int mascotaIdMascota;
     private int clienteIdcliente;

    public MascotaporclienteId() {
    }

    public MascotaporclienteId(int mascotaIdMascota, int clienteIdcliente) {
       this.mascotaIdMascota = mascotaIdMascota;
       this.clienteIdcliente = clienteIdcliente;
    }
   
    public int getMascotaIdMascota() {
        return this.mascotaIdMascota;
    }
    
    public void setMascotaIdMascota(int mascotaIdMascota) {
        this.mascotaIdMascota = mascotaIdMascota;
    }
    public int getClienteIdcliente() {
        return this.clienteIdcliente;
    }
    
    public void setClienteIdcliente(int clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MascotaporclienteId) ) return false;
		 MascotaporclienteId castOther = ( MascotaporclienteId ) other; 
         
		 return (this.getMascotaIdMascota()==castOther.getMascotaIdMascota())
 && (this.getClienteIdcliente()==castOther.getClienteIdcliente());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getMascotaIdMascota();
         result = 37 * result + this.getClienteIdcliente();
         return result;
   }   


}


