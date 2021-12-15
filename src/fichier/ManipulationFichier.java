package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ManipulationFichier {

	public static final String INPUT_FILE_PATHNAME = "./ressources/recensement.csv";
	public static final String OUTPUT_FILE_PATHNAME = "./ressources/output.csv";
	public static final String CSV_SEPARATOR = ";";

	public static void main(String[] args) throws IOException {

		Path pathFile = Paths.get(INPUT_FILE_PATHNAME);
		boolean isFile = Files.isRegularFile(pathFile);
		boolean isReadable = Files.isReadable(pathFile);

		String nomVilleAttrName = "Nom de la commune";
		String codeDepartementAttrName = "Code département";
		String populationTotaleAttrName = "Population totale";
		int nbMinHabs = 25000;

		Map<String, Integer> mapAttributeNameIndex = new HashMap<>();

		if (isFile && isReadable) {

			List<String> listInputLines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
			String inputline = "";
			String[] tokens;

			Iterator<String> itLine = listInputLines.iterator();
			if (itLine.hasNext()) {
				inputline = itLine.next();
				tokens = inputline.split(CSV_SEPARATOR);
				for (int i=0; i<tokens.length; i++) {
					if(tokens[i].equals(nomVilleAttrName)) {
						mapAttributeNameIndex.put(nomVilleAttrName, i);
					}
					else if(tokens[i].equals(codeDepartementAttrName)) {
						mapAttributeNameIndex.put(codeDepartementAttrName, i);
					}
					else if(tokens[i].equals(populationTotaleAttrName)) {
						mapAttributeNameIndex.put(populationTotaleAttrName, i);
					}
				}
			}

			List<String> listOutputLines = new ArrayList<>();
			String header = "";
			for (String key: mapAttributeNameIndex.keySet()) {
				header += key + CSV_SEPARATOR;
			}
			listOutputLines.add(header);

			while (itLine.hasNext()) {
				String outputLine = "";
				inputline = itLine.next();
				tokens = inputline.split(CSV_SEPARATOR);
				
				int nbHabs = Integer.parseInt(tokens[mapAttributeNameIndex.get(populationTotaleAttrName)].trim().replaceAll(" ", ""));
				if (nbHabs > nbMinHabs) {
					for (String key: mapAttributeNameIndex.keySet()) {
						outputLine += tokens[mapAttributeNameIndex.get(key)].trim().replaceAll(" ", "") + CSV_SEPARATOR;
					}
					listOutputLines.add(outputLine);
				}
			}

			Path pathCible = Paths.get(OUTPUT_FILE_PATHNAME);
			Files.write(pathCible, listOutputLines);
		}

	}

}
