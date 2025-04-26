import java.util.ArrayList;

//Controller for AddNumView
public class AddNumCtrl implements Controller {

	ArrayList<buggy_source_file> models;

	public AddNumCtrl() {
		models = new ArrayList<buggy_source_file>();
	}

	@Override
	public void addModel(buggy_source_file model) {
		models.add(model);
	}

	@Override
	public void updateModels(Double num) {

		for (buggy_source_file model: models) {
			model.addData(num);
		}
	}

}
