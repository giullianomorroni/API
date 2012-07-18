
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.<WBR>PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import javax.print.PrintService;
import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFPage;
import com.sun.pdfview.PDFRenderer;


/**
 * @author Giulliano Morroni
 * @since 04/08/2011
 */
public class ImpressoraDemo {

	final static String nomeImpressora = "\\\\servidor\\hp_laserjet_4";
	final static Integer quantidadeDeVias =  1;

	/**
	 * Cria filas de impressão para arquivos do tipo PDF.
	 * 
	 * @param arquivos
	 * @throws IOException
	 * @throws PrinterException
	 * @since 19/08/2011
	 */
	public static void criarFilaImpressao(List arquivos) throws IOException, PrinterException {
		System.out.println("Iniciando impressão fisica");
		PrintService impressora = null;
		PrintService[] impressoras = PrinterJob.<WBR>lookupPrintServices(); //Lista de todas impressoras instaladas no seu PC.
		
		for (PrintService ps : impressoras) {
			if (ps.getName().contains(<WBR>nomeImpressora)) {
				impressora = ps; //A impressora desejada.
				break;
			}
		}

		/*
   	        * Abaixo é criado um "job" de impressão, e definido a impressora e a quantidade de vias.
		 */
		PrinterJob jobDeImpressao = PrinterJob.getPrinterJob();
		jobDeImpressao.<WBR>setPrintService(impressora);
		jobDeImpressao.setCopies(<WBR>quantidadeDeVias);

		for (File arquivo : arquivos) {
			FileInputStream fis = new FileInputStream(arquivo);
			FileChannel fc = fis.getChannel();
			ByteBuffer bb = fc.map(FileChannel.MapMode.<WBR>READ_ONLY, 0, fc.size());


			PDFFile pdfGerado = new PDFFile(bb);
			ArquivoImpressao arquivoParaImpressao = new ArquivoImpressao(pdfGerado);
			PageFormat defaultPage = jobDeImpressao.defaultPage();
			PageFormat formatoDaPagina = defaultPage;
			jobDeImpressao.setJobName(<WBR>arquivo.getName());

			Book documento = new Book();
			documento.append(<WBR>arquivoParaImpressao, formatoDaPagina, pdfGerado.getNumPages());
			jobDeImpressao.setPageable(<WBR>documento);
		        jobDeImpressao.print();
		}
		System.out.println("Impressão finalizada");
	}
}

/**
 * Esta classe monta o arquivo PDF num formato específicio do framework
 * PDF-Rendererer {@link PDFRendererer <a href="http://java.net/projects/pdf-renderer" target="_blank">http://java.net/projects/pdf-<WBR>renderer</a>}. Este framework
 * foi desenvolvido pela equipe Sun para suprir a falta de blibliotecas disponíveis 
 * para integração do Java com arquivos PDF.
 *  
 * @author Giulliano Morroni
 * @since 23/08/2011
 */

class ArquivoImpressao implements Printable {

	private PDFFile arquivoPDF;
	ArquivoImpressao(PDFFile arquivo) {
		this.arquivoPDF = arquivo;
	}

	public int print(Graphics grafico, PageFormat formato, int indice) throws PrinterException {
		int numeroDePaginas = indice + 1;
		if ((numeroDePaginas >= 1) && (numeroDePaginas <= arquivoPDF.getNumPages())) {
			Graphics2D grafico2D = (Graphics2D) grafico;
			PDFPage pagina = arquivoPDF.getPage(<WBR>numeroDePaginas);

			/* Define o tamanho da página e da área de impressão. */
			Rectangle imgbounds = new Rectangle(10,30,580,800);

			PDFRenderer renderizador = new PDFRenderer(pagina, grafico2D, imgbounds, null, null);
			try {
				pagina.waitForFinish();
				renderizador.run();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return PAGE_EXISTS;
		} else {
			return NO_SUCH_PAGE;
		}
	}
}

