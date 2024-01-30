class Badge {
    public String print(Integer id, String name, String department) {
        if(id == null && department !=null){
            return name+" - "+department.toUpperCase();
        }
        else if(department == null&& id != null){
            return "["+id+"] - "+name+" - OWNER";
        }
        else if (department == null&& id == null){
            return name+" - OWNER";
        }
        else{
            return "["+id+"] - "+name+" - "+department.toUpperCase();
        }
    }
}
