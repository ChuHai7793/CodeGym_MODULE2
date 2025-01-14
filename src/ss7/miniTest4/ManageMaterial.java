package ss7.miniTest4;

public class ManageMaterial {

    private Material[] materials;
    public ManageMaterial() {
        this.materials = new Material[0];
    }

    public ManageMaterial(Material[] materials) {
        this.materials = materials;
    }


    public void printMaterials(){
        for(Material material:this.materials){
            System.out.println(material);
        }
    }

    public void addMaterial(int index, Material material){
        Material[] newMaterials= new Material[this.materials.length + 1];
        for (int i = 0; i< this.materials.length+1;i++) {
            if (i < index) {
                newMaterials[i] = this.materials[i];
            } else if (i == index) {
                newMaterials[i] = material;
            } else {
                newMaterials[i] = this.materials[i - 1];
            }
        }
        this.materials = newMaterials;
    }

    public void delMaterial(int index){
        Material[] newMaterials= new Material[this.materials.length - 1];
        for(int i = 0;i<this.materials.length-1;i++){
            newMaterials[i] = this.materials[i];
            if(i>=index){
                newMaterials[i] = this.materials[i+1];
            }
        }
        this.materials = newMaterials;

    }

    public void editMaterial(int index, Material material){

        for(int i = 0;i<this.materials.length;i++){
            if(i==index){
                this.materials[i] = material;
            }
        }
    }

    public Material[] getMaterials() {
        return materials;
    }
    public int getSize(){
        return materials.length;
    }
}
