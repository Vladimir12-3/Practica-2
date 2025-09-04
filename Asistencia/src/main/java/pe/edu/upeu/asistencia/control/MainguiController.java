package pe.edu.upeu.asistencia.control;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.util.Map;


@Component
public class MainguiController{

    @FXML
    private MenuItem menuItem1, menuItem2, menuItem3, menuItem4;

    @FXML
    private MenuBar menuBar;

    @FXML
    private TabPane tabPane;

    @Autowired
    private ApplicationContext contex;

    @FXML
    public void initialize() {
        MenuItemListener miL = new MenuItemListener();
        menuItem1.setOnAction(miL::handle);
        menuItem2.setOnAction(miL::handle);
        menuItem3.setOnAction(miL::handle);
        menuItem4.setOnAction(miL::handle);
    }

    class MenuItemListener{

        Map<String,String[]> menuConfig=Map.of(
                "menuItem1",new String[]{"/fxml/main_participante.fxml","Participantes","T",},
                "menuItem2",new String[]{"/fxml/login.fxml","Close","C"},
                "menuItem3",new String[]{"/fxml/main.asistencia.fxml","Asistencia","I"},
                "menuItem4",new String[]{"/fxml/main.asistencia.fxml","Asistencia","4"}

        );


        public void handle(ActionEvent e){
            String id= ( (MenuItem) e.getSource() ).getId();
            if(menuConfig.containsKey(id)){
                String[] mi=menuConfig.get(id);
                if(mi[2].equals("C")){
                    Platform.exit();
                    System.exit(0);
                }else{
                    abrilArchivoFXML(mi[0],mi[1]);
                }


            }

        }

        public void abrilArchivoFXML(String filename, String tittle) {
            try{


                FXMLLoader loader = new FXMLLoader(getClass().getResource(filename));
                loader.setControllerFactory(contex::getBean);
                Parent root = loader.load();



                ScrollPane scrollPane = new ScrollPane(root);
                scrollPane.setFitToWidth(true);
                scrollPane.setFitToHeight(true);
                Tab newTab = new Tab(tittle, scrollPane);
                tabPane.getTabs().clear();
                tabPane.getTabs().add(newTab);


            }catch (IOException ex) {
                throw new RuntimeException(ex);
            }



        }




    }

    class MenuListener{
        public void handle(Event e){}
    }



}