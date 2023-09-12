public class AdapaterEditorToInstagram extends PhotoEditor implements Instagram{
    @Override
    public void save() {
        savePhoto();
    }

    @Override
    public void edit() {
        editPhoto();
    }

    @Override
    public void delete() {
        deletePhoto();
    }
}
