import java.util.ArrayList;

//Controller for ResetView
public class ResetCtrl implements Controller {

	ArrayList<buggy_source_file> models;

	public ResetCtrl() {
		models = new ArrayList<buggy_source_file>();
	}

	@Override
	public void addModel(buggy_source_file model) {
		models.add(model);
	}

	@Override
	public void updateModels(Double num) {
		//New ArrayList resets model in Numbers.java
		for (buggy_source_file model: models) {
			model.update(new ArrayList<Double>());
		}
	}

}
