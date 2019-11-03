public class ProtoType implements Cloneable {
    public ProtoType clone() {
        ProtoType protoType = null;
        try {
            protoType = (ProtoType)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        return protoType;
    }
}
