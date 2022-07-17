package ro.usv;

import java.util.ArrayList;

public class Library<Media> {
    private ArrayList<Media> resources= new ArrayList<>();
    public void addMedia( Media element) { // what should be the type of element in order to meet all three media types (book, video, and newspaper)
        resources.add(element);
    }
    public void showMedia(){
    for(Media m:resources)
        {
            System.out.println(m.toString());
    }
    }
    public Media retrieveLast(){
        return resources.get(resources.size()-1);
    }
}
