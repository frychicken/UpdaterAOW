import java.awt.Component;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
class Uaow {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException { 
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		Upd ipd = new Upd();
		ipd.doup();
	}
}
class Upd{
	public void doup() throws IOException {
		File file2[] = new File[10];
		try {
		file2[0] = new File(getClass().getResource("Dog_.class").toString().substring(getClass().getResource("Dog_.class").toString().indexOf(":")+1));
    	file2[2] = new File(getClass().getResource("Execut.class").toString().substring(getClass().getResource("Execut.class").toString().indexOf(":")+1));
		file2[3] = new File(getClass().getResource("Nani.class").toString().substring(getClass().getResource("Nani.class").toString().indexOf(":")+1));
		file2[4] = new File(getClass().getResource("Soundfx.class").toString().substring(getClass().getResource("Soundfx.class").toString().indexOf(":")+1));
		file2[5] = new File(getClass().getResource("Loading.class").toString().substring(getClass().getResource("Loading.class").toString().indexOf(":")+1));
		file2[1] = new File(getClass().getResource("Frychicken.class").toString().substring(getClass().getResource("Frychicken.class").toString().indexOf(":")+1));
		file2[6] = new File(getClass().getResource("Execut$Method_T.class").toString().substring(getClass().getResource("Execut$Method_T.class").toString().indexOf(":")+1));
		file2[7] = new File(getClass().getResource("Dog_$1.class").toString().substring(getClass().getResource("Dog_$1.class").toString().indexOf(":")+1));
		file2[8] = new File(getClass().getResource("DrawCheck.class").toString().substring(getClass().getResource("DrawCheck.class").toString().indexOf(":")+1));
		file2[9] = new File(getClass().getResource("Estima.class").toString().substring(getClass().getResource("Estima.class").toString().indexOf(":")+1));
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		for(int a =0; a<9; a++) {
		try {
			file2[a].delete();
		} catch (Exception e) {
			System.out.println("cannot find file"+file2[a]);
			JOptionPane.showConfirmDialog((Component) null, "Cannot find file "+file2[a],
					"Update", JOptionPane.CLOSED_OPTION);
			e.printStackTrace();
		 }
		}
		String cheee =  System.getProperty("user.dir");
		File file = new File(cheee+"/AOW.jar"); 
		try {
			file.delete();
		} catch (Exception e) {
			System.out.println("cannot find file");
			JOptionPane.showConfirmDialog((Component) null, "Cannot find file\n AOW.jar",
					"Update", JOptionPane.CLOSED_OPTION);
			e.printStackTrace();
		}
		try {
			URL website = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/JarFile/AOW.jar");
			ReadableByteChannel ok = Channels.newChannel(website.openStream());
			FileOutputStream okay = new FileOutputStream(cheee+"/AOW.jar");
			okay.getChannel().transferFrom(ok, 0, Long.MAX_VALUE);
			okay.close();
			ok.close();
		} catch (Exception e) {
			System.out.println("Update failed");
			JOptionPane.showConfirmDialog((Component) null, "Update failed\n Cannot download file",
					"Update", JOptionPane.CLOSED_OPTION);
			e.printStackTrace();
		}
		Runtime r= Runtime.getRuntime();
		r.exec("java -jar AOW.jar");
		JOptionPane.showConfirmDialog((Component) null, "Update completed",
				"Update", JOptionPane.CLOSED_OPTION);
	}
}


