import domain.models.*;


public class Main {
    public static void main(String[] args) {
        
        
        Main main = new Main();
        main.printCurso();


    }

    private void printCurso() {
        Curso curso = new Curso();
        curso.setId(2022);
        curso.setNombre("2023-22");
        curso.setDescripcion("Desde septiembre a julio");

        Matrícula matrícula = new Matrícula();
        matrícula.setCurso("2022-2023");
        matrícula.setId(2309829);


        Alumno alumno = new Alumno();
        alumno.setId(1);
        alumno.setNombre("Pepe");
        alumno.setApellidos("Gomez");
        alumno.setDni("2343p");
        alumno.setDireccion("Avila");
        alumno.setMadre("Pepe");
        alumno.setPadre("Pepe");
        alumno.setEmail("pepe@#####");

        Asignatura asignatura = new Asignatura();
        asignatura.setId(212);
        asignatura.setNombre("mates");



        Profesor profesor = new Profesor();
        profesor.setId(56);
        profesor.setNombre("Maria");
        profesor.setApellidos("Jimenez");
        profesor.setDni("23s");
        profesor.setDireccion("Avila");
        profesor.setFechaAlta("2022");
        profesor.setTituloAcdemico("Profesor");

        Aula aula = new Aula();
        aula.setId(42);
        aula.setPlanta("Segunda planta");
        aula.setCapacidad(34);



        Docencia docencia = new Docencia();
        docencia.setSillas(23);
        docencia.setTipoPizarra("Electronica");

        Ordenadores ordenadores = new Ordenadores();
        ordenadores.setNumOrdenadores(35);
        ordenadores.setTipoOrdenadores("Race");



        System.out.println("============================================");
        System.out.println("En el Curso:" + curso.getId(2023));
        System.out.println("Con el nombre:" + curso.getNombre("2023-22"));
        System.out.println("El cual:" + curso.getDescripcion("Desde septiembre a julio"));
        System.out.println("============================================");



        //Matriculacion
        System.out.println("============================================");
        System.out.println("Con la matricula: " + Matrícula.getId());
        System.out.println("En el curso " + Matrícula.getCurso());
        System.out.println("============================================");



        //Alumno
        System.out.println("============================================");
        System.out.println("El alumno:" + Alumno.getId());
        System.out.println("Con el nombre" + Alumno.getNombre());
        System.out.println("y los apellidos" + Alumno.getApellidos());
        System.out.println("DNI: " + Alumno.getDni());
        System.out.println("Direccion: " + Alumno.getDireccion());
        System.out.println("Padres: " + Alumno.getPadre() + Alumno.getMadre());
        System.out.println("Email: " + Alumno.getEmail());
        System.out.println("============================================");


        //Asignaturas
        System.out.println("============================================");
        System.out.println("Con las asignaturas" + Asignatura.getId());
        System.out.println("Con el nombre" + Asignatura.getNombre());
        System.out.println("============================================");


        //Profesores
        System.out.println("============================================");
        System.out.println("El profesor:" + Profesor.getId(56));
        System.out.println("Con el nombre" + Profesor.getNombre("Maria"));
        System.out.println("y los apellidos" + Profesor.getApellidos());
        System.out.println("DNI:" + Profesor.getDni());
        System.out.println("Direccion:" + Profesor.getDireccion());
        System.out.println("============================================");


        //Clases
        System.out.println("============================================");
        System.out.println("En la clase:" + Aula.getId());
        System.out.println("Que se encuentra en la planta:" + Aula.getPlanta());
        System.out.println("Con una capacidad:" + Aula.getId());
        System.out.println("Con un numero de sillas:" + Docencia.getSillas());
        System.out.println(" Y una pizarra " + Docencia.getTipoPizarra());
        System.out.println("============================================");



        System.out.println("============================================");
        System.out.println("En la clase:" + Aula.getId());
        System.out.println("Que se encuentra en la planta:" + Aula.getPlanta());
        System.out.println("Con una capacidad:" + Aula.getId());
        System.out.println("Con un numero de sillas:" + Docencia.getSillas());
        System.out.println(" Y una pizarra " + Docencia.getTipoPizarra());
        System.out.println("============================================");

        System.out.println("============================================");
        System.out.println("En la clase:" + Aula.getId());
        System.out.println("Que se encuentra en la planta:" + Aula.getPlanta());
        System.out.println("Tiene " +  Ordenadores.getNumOrdenadores());
        System.out.println("de la marca " +  Ordenadores.getTipoOrdenadores());
        System.out.println("============================================");


    }


}

