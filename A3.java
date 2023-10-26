package test;

public class A3 {
	public static void main(String[] args) {
		int[] ev = { 850, 945, 1145, 1155, 1230, 1245, 1330, 1340, 1425, 1445 };
		int totalRunningTime = 0;

		for (int i = 0; i < ev.length - 1; i += 2) {
			int onTime = ev[i];
			int offTime = ev[i + 1];

			// Convert times to minutes
			int onMinutes = (onTime / 100) * 60 + (onTime % 100);
			int offMinutes = (offTime / 100) * 60 + (offTime % 100);

			// Calculate and add the duration
			int duration = offMinutes - onMinutes;
			totalRunningTime += duration;
		}
		// Convert totalRunningTime to hours and minutes
		int hours = totalRunningTime / 60;
		int minutes = totalRunningTime % 60;
		System.out.println(hours + " hr " + minutes + " min");
	}

}
