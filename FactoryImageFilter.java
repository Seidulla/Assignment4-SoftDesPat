
public class FactoryImageFilter {
	public FilterImage createFilter(String filterType) {
	        if ("Grayscale".equalsIgnoreCase(filterType)) {
	            return new Grayscale();
	        } else if ("Sepia".equalsIgnoreCase(filterType)) {
	            return new Sepia();
	        }
	        return null;
	    }
}
