package AGROCROPS;
import java.lang.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AGRO extends HttpServlet {
private static final long serialVersionUID = 1L;
public AGRO() {
super();
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.getWriter().append("Served at: ").append(request.getContextPath());
String name=request.getParameter("name");
String MobileNo=request.getParameter("MobileNo");
String State=request.getParameter("State");
String Distric=request.getParameter("Distric");
String Profession=request.getParameter("Profession");
String Crops=request.getParameter("Crops");



response.setContentType("text/html");
PrintWriter ps=response.getWriter();
ps.println("<br>");ps.println("Following Information Registred");
ps.println("<br>");ps.println("Name:"+name);
ps.println("<br>");ps.println("MobileNo:"+MobileNo);
ps.println("<br>");ps.println("State:"+State);
ps.println("<br>");ps.println("Distric:"+Distric);
ps.println("<br>");ps.println("Profession:"+profession);
ps.println("<br>");

switch(Crops)
{
case Potato:
ps.println("<br>");ps.println("Name: Potato
Pesticide: fungicide chlorothalonil
Optimum temperature: 45-80'F
No.of plants per acre: 245&610 cwt per acre
Time duration: 60-70 days
Land: well-drained soil land
");
break;

case Tomato:
ps.println("<br>");ps.println("Name: Tomato
Pesticide: DDT
Optimum temperature: 60-90'
Plants: 4,000-4,800 plants per acre
Time duration: 65 days
Land: loam& sandy loam soil
");
break;

case Broccoli:
ps.println("<br>");ps.println("Name: Broccoli
Pesticide: Dimethoate
Optimum temperature: 70-80'F
Yield: 14,000-24,000 plants per acre
Time duration: 50-100 days
Cool weather crop
");
break;

case Carrot:
ps.println("<br>");ps.println("Name:Carrot
Pesticide: Diazinon
Optimum temperature: 60&65'F
Yield: 12 tonnes per hectare
Land: deep clay free soil
Time duration: 75 days
");
break;

case Corn:
ps.println("<br>");ps.println("Name: Corn
Pesticides: Glyphosate herbicides
Yield: 32,000 plants per acre
Optimum temperature: 50'F
Time duration: 60-100 days
Warm season annual
");
break;

case Onion:
ps.println("<br>");ps.println(")Name: Onion
Pesticide: Malathion
Yield: 20,000 kgs per acre
Time duration: 100-175 days
Optimum temperature: 32'-40'F
Land: Soils from sandy loam to clay loam with good drainage facilities
");
break;

case Cabbage:
ps.println("<br>");ps.println("Name: Cabbage
Pesticide: Permethrin
Yield: 15-25 tons per hectare
Time duration: 70 days
Optimum temperature: 60-65'F
Land: Grown in slightly acidic soil
");
break;

case Cauliflower:
ps.println("<br>");ps.println("Name: Cauliflower
Pesticide: Endosulfan
Yield: 240-280 tonnes per hectare
Time duration: 6-8 weeks
Optimum temperature: 50'F
Land: It must be fine tilth by 3-4 deep ploughing
");
break;

case Cucumber:
ps.println("<br>");ps.println("Name: Cucumber
Pesticide: Dieldrin
Yield: 65,000 plants
Time duration: 50-70 days
Optimum temperature: 80-90'F
Land: Sandy loam & clay loam soil
");
break;

case Radish:
ps.println("<br>");ps.println("Name: Radish
Pesticide: Raphanus sativus
Yield: 2,500 dozen bunches
Time duration: 22-70 days
Optimum temperature: 65-85'F 
Land: Soil should be ploughed to depth of 30-40 cm to provide fine tilth
");
break;
}
}
}

